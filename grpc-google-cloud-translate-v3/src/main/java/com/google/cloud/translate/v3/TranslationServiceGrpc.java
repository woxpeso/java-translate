/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.translate.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Provides natural language translation operations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/translate/v3/translation_service.proto")
public final class TranslationServiceGrpc {

  private TranslationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.translation.v3.TranslationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.TranslateTextRequest,
          com.google.cloud.translate.v3.TranslateTextResponse>
      getTranslateTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TranslateText",
      requestType = com.google.cloud.translate.v3.TranslateTextRequest.class,
      responseType = com.google.cloud.translate.v3.TranslateTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.TranslateTextRequest,
          com.google.cloud.translate.v3.TranslateTextResponse>
      getTranslateTextMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.TranslateTextRequest,
            com.google.cloud.translate.v3.TranslateTextResponse>
        getTranslateTextMethod;
    if ((getTranslateTextMethod = TranslationServiceGrpc.getTranslateTextMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getTranslateTextMethod = TranslationServiceGrpc.getTranslateTextMethod) == null) {
          TranslationServiceGrpc.getTranslateTextMethod =
              getTranslateTextMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.TranslateTextRequest,
                          com.google.cloud.translate.v3.TranslateTextResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TranslateText"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.TranslateTextRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.TranslateTextResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("TranslateText"))
                      .build();
        }
      }
    }
    return getTranslateTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.DetectLanguageRequest,
          com.google.cloud.translate.v3.DetectLanguageResponse>
      getDetectLanguageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectLanguage",
      requestType = com.google.cloud.translate.v3.DetectLanguageRequest.class,
      responseType = com.google.cloud.translate.v3.DetectLanguageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.DetectLanguageRequest,
          com.google.cloud.translate.v3.DetectLanguageResponse>
      getDetectLanguageMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.DetectLanguageRequest,
            com.google.cloud.translate.v3.DetectLanguageResponse>
        getDetectLanguageMethod;
    if ((getDetectLanguageMethod = TranslationServiceGrpc.getDetectLanguageMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getDetectLanguageMethod = TranslationServiceGrpc.getDetectLanguageMethod) == null) {
          TranslationServiceGrpc.getDetectLanguageMethod =
              getDetectLanguageMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.DetectLanguageRequest,
                          com.google.cloud.translate.v3.DetectLanguageResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetectLanguage"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.DetectLanguageRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.DetectLanguageResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("DetectLanguage"))
                      .build();
        }
      }
    }
    return getDetectLanguageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.GetSupportedLanguagesRequest,
          com.google.cloud.translate.v3.SupportedLanguages>
      getGetSupportedLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSupportedLanguages",
      requestType = com.google.cloud.translate.v3.GetSupportedLanguagesRequest.class,
      responseType = com.google.cloud.translate.v3.SupportedLanguages.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.GetSupportedLanguagesRequest,
          com.google.cloud.translate.v3.SupportedLanguages>
      getGetSupportedLanguagesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.GetSupportedLanguagesRequest,
            com.google.cloud.translate.v3.SupportedLanguages>
        getGetSupportedLanguagesMethod;
    if ((getGetSupportedLanguagesMethod = TranslationServiceGrpc.getGetSupportedLanguagesMethod)
        == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getGetSupportedLanguagesMethod = TranslationServiceGrpc.getGetSupportedLanguagesMethod)
            == null) {
          TranslationServiceGrpc.getGetSupportedLanguagesMethod =
              getGetSupportedLanguagesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.GetSupportedLanguagesRequest,
                          com.google.cloud.translate.v3.SupportedLanguages>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetSupportedLanguages"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.GetSupportedLanguagesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.SupportedLanguages
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("GetSupportedLanguages"))
                      .build();
        }
      }
    }
    return getGetSupportedLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.BatchTranslateTextRequest, com.google.longrunning.Operation>
      getBatchTranslateTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchTranslateText",
      requestType = com.google.cloud.translate.v3.BatchTranslateTextRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.BatchTranslateTextRequest, com.google.longrunning.Operation>
      getBatchTranslateTextMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.BatchTranslateTextRequest,
            com.google.longrunning.Operation>
        getBatchTranslateTextMethod;
    if ((getBatchTranslateTextMethod = TranslationServiceGrpc.getBatchTranslateTextMethod)
        == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getBatchTranslateTextMethod = TranslationServiceGrpc.getBatchTranslateTextMethod)
            == null) {
          TranslationServiceGrpc.getBatchTranslateTextMethod =
              getBatchTranslateTextMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.BatchTranslateTextRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchTranslateText"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.BatchTranslateTextRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("BatchTranslateText"))
                      .build();
        }
      }
    }
    return getBatchTranslateTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.CreateGlossaryRequest, com.google.longrunning.Operation>
      getCreateGlossaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGlossary",
      requestType = com.google.cloud.translate.v3.CreateGlossaryRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.CreateGlossaryRequest, com.google.longrunning.Operation>
      getCreateGlossaryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.CreateGlossaryRequest, com.google.longrunning.Operation>
        getCreateGlossaryMethod;
    if ((getCreateGlossaryMethod = TranslationServiceGrpc.getCreateGlossaryMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getCreateGlossaryMethod = TranslationServiceGrpc.getCreateGlossaryMethod) == null) {
          TranslationServiceGrpc.getCreateGlossaryMethod =
              getCreateGlossaryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.CreateGlossaryRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGlossary"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.CreateGlossaryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("CreateGlossary"))
                      .build();
        }
      }
    }
    return getCreateGlossaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.ListGlossariesRequest,
          com.google.cloud.translate.v3.ListGlossariesResponse>
      getListGlossariesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGlossaries",
      requestType = com.google.cloud.translate.v3.ListGlossariesRequest.class,
      responseType = com.google.cloud.translate.v3.ListGlossariesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.ListGlossariesRequest,
          com.google.cloud.translate.v3.ListGlossariesResponse>
      getListGlossariesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.ListGlossariesRequest,
            com.google.cloud.translate.v3.ListGlossariesResponse>
        getListGlossariesMethod;
    if ((getListGlossariesMethod = TranslationServiceGrpc.getListGlossariesMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getListGlossariesMethod = TranslationServiceGrpc.getListGlossariesMethod) == null) {
          TranslationServiceGrpc.getListGlossariesMethod =
              getListGlossariesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.ListGlossariesRequest,
                          com.google.cloud.translate.v3.ListGlossariesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGlossaries"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.ListGlossariesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.ListGlossariesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("ListGlossaries"))
                      .build();
        }
      }
    }
    return getListGlossariesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.GetGlossaryRequest, com.google.cloud.translate.v3.Glossary>
      getGetGlossaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGlossary",
      requestType = com.google.cloud.translate.v3.GetGlossaryRequest.class,
      responseType = com.google.cloud.translate.v3.Glossary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.GetGlossaryRequest, com.google.cloud.translate.v3.Glossary>
      getGetGlossaryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.GetGlossaryRequest,
            com.google.cloud.translate.v3.Glossary>
        getGetGlossaryMethod;
    if ((getGetGlossaryMethod = TranslationServiceGrpc.getGetGlossaryMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getGetGlossaryMethod = TranslationServiceGrpc.getGetGlossaryMethod) == null) {
          TranslationServiceGrpc.getGetGlossaryMethod =
              getGetGlossaryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.GetGlossaryRequest,
                          com.google.cloud.translate.v3.Glossary>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGlossary"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.GetGlossaryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.Glossary.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("GetGlossary"))
                      .build();
        }
      }
    }
    return getGetGlossaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.DeleteGlossaryRequest, com.google.longrunning.Operation>
      getDeleteGlossaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGlossary",
      requestType = com.google.cloud.translate.v3.DeleteGlossaryRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.translate.v3.DeleteGlossaryRequest, com.google.longrunning.Operation>
      getDeleteGlossaryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.translate.v3.DeleteGlossaryRequest, com.google.longrunning.Operation>
        getDeleteGlossaryMethod;
    if ((getDeleteGlossaryMethod = TranslationServiceGrpc.getDeleteGlossaryMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getDeleteGlossaryMethod = TranslationServiceGrpc.getDeleteGlossaryMethod) == null) {
          TranslationServiceGrpc.getDeleteGlossaryMethod =
              getDeleteGlossaryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.translate.v3.DeleteGlossaryRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGlossary"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.translate.v3.DeleteGlossaryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TranslationServiceMethodDescriptorSupplier("DeleteGlossary"))
                      .build();
        }
      }
    }
    return getDeleteGlossaryMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static TranslationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceStub>() {
          @java.lang.Override
          public TranslationServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TranslationServiceStub(channel, callOptions);
          }
        };
    return TranslationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TranslationServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceBlockingStub>() {
          @java.lang.Override
          public TranslationServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TranslationServiceBlockingStub(channel, callOptions);
          }
        };
    return TranslationServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static TranslationServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceFutureStub>() {
          @java.lang.Override
          public TranslationServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TranslationServiceFutureStub(channel, callOptions);
          }
        };
    return TranslationServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Provides natural language translation operations.
   * </pre>
   */
  public abstract static class TranslationServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Translates input text and returns translated text.
     * </pre>
     */
    public void translateText(
        com.google.cloud.translate.v3.TranslateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.TranslateTextResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getTranslateTextMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Detects the language of text within a request.
     * </pre>
     */
    public void detectLanguage(
        com.google.cloud.translate.v3.DetectLanguageRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.DetectLanguageResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getDetectLanguageMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of supported languages for translation.
     * </pre>
     */
    public void getSupportedLanguages(
        com.google.cloud.translate.v3.GetSupportedLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.SupportedLanguages>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetSupportedLanguagesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Translates a large volume of text in asynchronous batch mode.
     * This function provides real-time output as the inputs are being processed.
     * If caller cancels a request, the partial results (for an input file, it's
     * all or nothing) may still be available on the specified output location.
     * This call returns immediately and you can
     * use google.longrunning.Operation.name to poll the status of the call.
     * </pre>
     */
    public void batchTranslateText(
        com.google.cloud.translate.v3.BatchTranslateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchTranslateTextMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a glossary and returns the long-running operation. Returns
     * NOT_FOUND, if the project doesn't exist.
     * </pre>
     */
    public void createGlossary(
        com.google.cloud.translate.v3.CreateGlossaryRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGlossaryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't
     * exist.
     * </pre>
     */
    public void listGlossaries(
        com.google.cloud.translate.v3.ListGlossariesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.ListGlossariesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListGlossariesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a glossary. Returns NOT_FOUND, if the glossary doesn't
     * exist.
     * </pre>
     */
    public void getGlossary(
        com.google.cloud.translate.v3.GetGlossaryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.Glossary> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGlossaryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a glossary, or cancels glossary construction
     * if the glossary isn't created yet.
     * Returns NOT_FOUND, if the glossary doesn't exist.
     * </pre>
     */
    public void deleteGlossary(
        com.google.cloud.translate.v3.DeleteGlossaryRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGlossaryMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getTranslateTextMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.TranslateTextRequest,
                      com.google.cloud.translate.v3.TranslateTextResponse>(
                      this, METHODID_TRANSLATE_TEXT)))
          .addMethod(
              getDetectLanguageMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.DetectLanguageRequest,
                      com.google.cloud.translate.v3.DetectLanguageResponse>(
                      this, METHODID_DETECT_LANGUAGE)))
          .addMethod(
              getGetSupportedLanguagesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.GetSupportedLanguagesRequest,
                      com.google.cloud.translate.v3.SupportedLanguages>(
                      this, METHODID_GET_SUPPORTED_LANGUAGES)))
          .addMethod(
              getBatchTranslateTextMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.BatchTranslateTextRequest,
                      com.google.longrunning.Operation>(this, METHODID_BATCH_TRANSLATE_TEXT)))
          .addMethod(
              getCreateGlossaryMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.CreateGlossaryRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_GLOSSARY)))
          .addMethod(
              getListGlossariesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.ListGlossariesRequest,
                      com.google.cloud.translate.v3.ListGlossariesResponse>(
                      this, METHODID_LIST_GLOSSARIES)))
          .addMethod(
              getGetGlossaryMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.GetGlossaryRequest,
                      com.google.cloud.translate.v3.Glossary>(this, METHODID_GET_GLOSSARY)))
          .addMethod(
              getDeleteGlossaryMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.translate.v3.DeleteGlossaryRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_GLOSSARY)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Provides natural language translation operations.
   * </pre>
   */
  public static final class TranslationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TranslationServiceStub> {
    private TranslationServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Translates input text and returns translated text.
     * </pre>
     */
    public void translateText(
        com.google.cloud.translate.v3.TranslateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.TranslateTextResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTranslateTextMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Detects the language of text within a request.
     * </pre>
     */
    public void detectLanguage(
        com.google.cloud.translate.v3.DetectLanguageRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.DetectLanguageResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectLanguageMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of supported languages for translation.
     * </pre>
     */
    public void getSupportedLanguages(
        com.google.cloud.translate.v3.GetSupportedLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.SupportedLanguages>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSupportedLanguagesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Translates a large volume of text in asynchronous batch mode.
     * This function provides real-time output as the inputs are being processed.
     * If caller cancels a request, the partial results (for an input file, it's
     * all or nothing) may still be available on the specified output location.
     * This call returns immediately and you can
     * use google.longrunning.Operation.name to poll the status of the call.
     * </pre>
     */
    public void batchTranslateText(
        com.google.cloud.translate.v3.BatchTranslateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchTranslateTextMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a glossary and returns the long-running operation. Returns
     * NOT_FOUND, if the project doesn't exist.
     * </pre>
     */
    public void createGlossary(
        com.google.cloud.translate.v3.CreateGlossaryRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGlossaryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't
     * exist.
     * </pre>
     */
    public void listGlossaries(
        com.google.cloud.translate.v3.ListGlossariesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.ListGlossariesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGlossariesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a glossary. Returns NOT_FOUND, if the glossary doesn't
     * exist.
     * </pre>
     */
    public void getGlossary(
        com.google.cloud.translate.v3.GetGlossaryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.Glossary> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGlossaryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a glossary, or cancels glossary construction
     * if the glossary isn't created yet.
     * Returns NOT_FOUND, if the glossary doesn't exist.
     * </pre>
     */
    public void deleteGlossary(
        com.google.cloud.translate.v3.DeleteGlossaryRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGlossaryMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Provides natural language translation operations.
   * </pre>
   */
  public static final class TranslationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TranslationServiceBlockingStub> {
    private TranslationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Translates input text and returns translated text.
     * </pre>
     */
    public com.google.cloud.translate.v3.TranslateTextResponse translateText(
        com.google.cloud.translate.v3.TranslateTextRequest request) {
      return blockingUnaryCall(getChannel(), getTranslateTextMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Detects the language of text within a request.
     * </pre>
     */
    public com.google.cloud.translate.v3.DetectLanguageResponse detectLanguage(
        com.google.cloud.translate.v3.DetectLanguageRequest request) {
      return blockingUnaryCall(getChannel(), getDetectLanguageMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of supported languages for translation.
     * </pre>
     */
    public com.google.cloud.translate.v3.SupportedLanguages getSupportedLanguages(
        com.google.cloud.translate.v3.GetSupportedLanguagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSupportedLanguagesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Translates a large volume of text in asynchronous batch mode.
     * This function provides real-time output as the inputs are being processed.
     * If caller cancels a request, the partial results (for an input file, it's
     * all or nothing) may still be available on the specified output location.
     * This call returns immediately and you can
     * use google.longrunning.Operation.name to poll the status of the call.
     * </pre>
     */
    public com.google.longrunning.Operation batchTranslateText(
        com.google.cloud.translate.v3.BatchTranslateTextRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchTranslateTextMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a glossary and returns the long-running operation. Returns
     * NOT_FOUND, if the project doesn't exist.
     * </pre>
     */
    public com.google.longrunning.Operation createGlossary(
        com.google.cloud.translate.v3.CreateGlossaryRequest request) {
      return blockingUnaryCall(getChannel(), getCreateGlossaryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't
     * exist.
     * </pre>
     */
    public com.google.cloud.translate.v3.ListGlossariesResponse listGlossaries(
        com.google.cloud.translate.v3.ListGlossariesRequest request) {
      return blockingUnaryCall(getChannel(), getListGlossariesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a glossary. Returns NOT_FOUND, if the glossary doesn't
     * exist.
     * </pre>
     */
    public com.google.cloud.translate.v3.Glossary getGlossary(
        com.google.cloud.translate.v3.GetGlossaryRequest request) {
      return blockingUnaryCall(getChannel(), getGetGlossaryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a glossary, or cancels glossary construction
     * if the glossary isn't created yet.
     * Returns NOT_FOUND, if the glossary doesn't exist.
     * </pre>
     */
    public com.google.longrunning.Operation deleteGlossary(
        com.google.cloud.translate.v3.DeleteGlossaryRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteGlossaryMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Provides natural language translation operations.
   * </pre>
   */
  public static final class TranslationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TranslationServiceFutureStub> {
    private TranslationServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Translates input text and returns translated text.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.translate.v3.TranslateTextResponse>
        translateText(com.google.cloud.translate.v3.TranslateTextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTranslateTextMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Detects the language of text within a request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.translate.v3.DetectLanguageResponse>
        detectLanguage(com.google.cloud.translate.v3.DetectLanguageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectLanguageMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of supported languages for translation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.translate.v3.SupportedLanguages>
        getSupportedLanguages(com.google.cloud.translate.v3.GetSupportedLanguagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSupportedLanguagesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Translates a large volume of text in asynchronous batch mode.
     * This function provides real-time output as the inputs are being processed.
     * If caller cancels a request, the partial results (for an input file, it's
     * all or nothing) may still be available on the specified output location.
     * This call returns immediately and you can
     * use google.longrunning.Operation.name to poll the status of the call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        batchTranslateText(com.google.cloud.translate.v3.BatchTranslateTextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchTranslateTextMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a glossary and returns the long-running operation. Returns
     * NOT_FOUND, if the project doesn't exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createGlossary(com.google.cloud.translate.v3.CreateGlossaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGlossaryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't
     * exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.translate.v3.ListGlossariesResponse>
        listGlossaries(com.google.cloud.translate.v3.ListGlossariesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGlossariesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a glossary. Returns NOT_FOUND, if the glossary doesn't
     * exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.translate.v3.Glossary>
        getGlossary(com.google.cloud.translate.v3.GetGlossaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGlossaryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a glossary, or cancels glossary construction
     * if the glossary isn't created yet.
     * Returns NOT_FOUND, if the glossary doesn't exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteGlossary(com.google.cloud.translate.v3.DeleteGlossaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGlossaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSLATE_TEXT = 0;
  private static final int METHODID_DETECT_LANGUAGE = 1;
  private static final int METHODID_GET_SUPPORTED_LANGUAGES = 2;
  private static final int METHODID_BATCH_TRANSLATE_TEXT = 3;
  private static final int METHODID_CREATE_GLOSSARY = 4;
  private static final int METHODID_LIST_GLOSSARIES = 5;
  private static final int METHODID_GET_GLOSSARY = 6;
  private static final int METHODID_DELETE_GLOSSARY = 7;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TranslationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TranslationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSLATE_TEXT:
          serviceImpl.translateText(
              (com.google.cloud.translate.v3.TranslateTextRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.TranslateTextResponse>)
                  responseObserver);
          break;
        case METHODID_DETECT_LANGUAGE:
          serviceImpl.detectLanguage(
              (com.google.cloud.translate.v3.DetectLanguageRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.DetectLanguageResponse>)
                  responseObserver);
          break;
        case METHODID_GET_SUPPORTED_LANGUAGES:
          serviceImpl.getSupportedLanguages(
              (com.google.cloud.translate.v3.GetSupportedLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.SupportedLanguages>)
                  responseObserver);
          break;
        case METHODID_BATCH_TRANSLATE_TEXT:
          serviceImpl.batchTranslateText(
              (com.google.cloud.translate.v3.BatchTranslateTextRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CREATE_GLOSSARY:
          serviceImpl.createGlossary(
              (com.google.cloud.translate.v3.CreateGlossaryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_GLOSSARIES:
          serviceImpl.listGlossaries(
              (com.google.cloud.translate.v3.ListGlossariesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.ListGlossariesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_GLOSSARY:
          serviceImpl.getGlossary(
              (com.google.cloud.translate.v3.GetGlossaryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.translate.v3.Glossary>)
                  responseObserver);
          break;
        case METHODID_DELETE_GLOSSARY:
          serviceImpl.deleteGlossary(
              (com.google.cloud.translate.v3.DeleteGlossaryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TranslationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TranslationService");
    }
  }

  private static final class TranslationServiceFileDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier {
    TranslationServiceFileDescriptorSupplier() {}
  }

  private static final class TranslationServiceMethodDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TranslationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TranslationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new TranslationServiceFileDescriptorSupplier())
                      .addMethod(getTranslateTextMethod())
                      .addMethod(getDetectLanguageMethod())
                      .addMethod(getGetSupportedLanguagesMethod())
                      .addMethod(getBatchTranslateTextMethod())
                      .addMethod(getCreateGlossaryMethod())
                      .addMethod(getListGlossariesMethod())
                      .addMethod(getGetGlossaryMethod())
                      .addMethod(getDeleteGlossaryMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
