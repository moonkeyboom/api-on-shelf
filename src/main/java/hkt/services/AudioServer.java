package hkt.services;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AudioServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(27016)
                .addService(new AudioServiceImpl())
                .build()
                .start();

        System.out.println("Server started, listening on port 27016");

        server.awaitTermination();
    }
}

