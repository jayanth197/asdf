set +x
LocalWorkspace=${WORKSPACE}
WARFilePath="$LocalWorkspace/target/partner-service.war"
echo "WAR File Path is ( Source path from the server) : $WARFilePath"

foldername="Partner-$(date +"%d-%m-%Y-%H-%M-%S")"
mkdir -p "$LocalWorkspace/target/$foldername"
echo "Folder is created"

echo "Starting - copying file from $WARFilePath to $LocalWorkspace/target/$foldername/"
cp $WARFilePath "$LocalWorkspace/target/$foldername/"
echo "Completed - copying file from $WARFilePath to $LocalWorkspace/target/$foldername/"

cd "$LocalWorkspace/target/"
echo "Starting - Upload folder to S3 bucket"
/usr/local/aws-cli/v2/2.4.6/dist/aws s3 cp $foldername "s3://insureall/Builds/Partners/$foldername/" --recursive
echo "Completed - Upload folder to S3 bucket"
