package userinterface;

import datastorageapiservices.DataStorageApiServices;
import datastorageapiservices.StorageComputationServiceGrpc;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

public class DataServiceClient {
    public DataServiceClient(String host, int port) {
        var channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        var client = StorageComputationServiceGrpc.newBlockingStub(channel);

        var request = DataStorageApiServices.UserInput.newBuilder().setNumber(64).build();
        var response = client.getInput(request);

        for (var i : response.getNumbersList()) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        new DataServiceClient("localhost", 8080);
    }
}



