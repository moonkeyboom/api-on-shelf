//package hkt.services;
//
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import grpc.partii.AudioServiceGrpc;
//import grpc.partii.AudioRequest;
//import grpc.partii.AudioResponse;
//
//
//public class AudioClient {
//    public static void main(String[] args) {
//        // Connect to the server
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("partii.aiforthai.in.th", 27016)
//                .usePlaintext() // For non-SSL connections
//                .build();
//
//        // Create a stub
//        AudioServiceGrpc.AudioServiceBlockingStub stub = AudioServiceGrpc.newBlockingStub(channel);
//
//        // Build and send request
//        AudioRequest request = AudioRequest.newBuilder()
//                .setAudioData(com.google.protobuf.ByteString.copyFromUtf8("audio byte data here"))
//                .setApiKey("FJynzn96xnhxIuAPr3S7f2gjuiNODMk6")
//                .build();
//
//        // Receive and print response
//        AudioResponse response = stub.streamAudio(request);
//        System.out.println("Response from server: " + response.getTextTranscription());
//
//        // Close the channel
//        channel.shutdown();
//    }
//}
//
