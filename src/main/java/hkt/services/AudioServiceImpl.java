//package hkt.services;
//
//import io.grpc.stub.StreamObserver;
//import grpc.partii.AudioServiceGrpc;
//import grpc.partii.AudioRequest;
//import grpc.partii.AudioResponse;
//
//public class AudioServiceImpl extends AudioServiceGrpc.AudioServiceImplBase {
//    @Override
//    public void streamAudio(AudioRequest request, StreamObserver<AudioResponse> responseObserver) {
//        // Process the audio data and transcribe it
//        String textTranscription = "Transcribed audio text here"; // Placeholder transcription
//
//        AudioResponse response = AudioResponse.newBuilder()
//                .setMessage("Audio processed successfully")
//                .setTextTranscription(textTranscription)
//                .build();
//
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//}
