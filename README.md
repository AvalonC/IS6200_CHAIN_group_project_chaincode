# IS6200 CHAIN group project chaincode

## Introduction
This chaincode is necessary for the system running due to the chaincode defines the operation that can be adapted in the network.

## How to use
1. You need pull this folder into a `<your folder name>` in the `/fabric-samples/asset-transfer-basic/`
2. You need to apply this chaincode in your network, use `./network.sh deployCC -ccn basic -ccp <your folder route> -ccl java`
3. After this, you can run step #5 in the project guideline.



## Reference from the HyperLedger Fabric

_This sample implements the basic asset transfer scenario, illustrating the use of the Java Contract SDKs to provide a smart contract as a service._

_To run this chaincode contract locally on a development network, see:_

- [Debugging chaincode as a service](../../test-network-k8s/docs/CHAINCODE_AS_A_SERVICE.md) (Kube test network)
- [End-to-end with the test-network](../../test-network/CHAINCODE_AS_A_SERVICE_TUTORIAL.md#end-to-end-with-the-the-test-network) (Docker compose)
