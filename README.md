# javaCamp22
sudo apt update
sudo apt install apt-transport-https ca-certificates curl software-properties-common

curl -fsSL https://download.docker.com/linux/debian/gpg | sudo gpg --dearmor -o /etc/apt/trusted.gpg.d/docker.gpg


echo "deb [arch=$(dpkg --print-architecture signed-by=/etc/apt/trusted.gpg.d/docker.gpg)] https://download.docker.com/linux/debian $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null


sudo apt update


sudo apt install docker-ce


sudo systemctl start docker
sudo systemctl enable docker


sudo docker --version
