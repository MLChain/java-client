package io.mlchain.javaclient;

/**
 * This exception class represents a general exception that may occur while using the Mlchain API client.
 * It is used to handle errors related to the Mlchain API interactions.
 */
public class MlchainClientException extends Exception{
    /**
     * Constructs a new MlchainClientException with the provided error message.
     *
     * @param message The error message describing the reason for the exception.
     */
    public MlchainClientException(String message) {
        super(message);
    }
}
/**
 * This exception class represents an exception that occurs specifically during Mlchain API request operations.
 * It is used to handle errors related to sending requests to the Mlchain API.
 */
class MlchainRequestException extends MlchainClientException {
    /**
     * Constructs a new MlchainRequestException with the provided error message.
     *
     * @param message The error message describing the reason for the request exception.
     */
    public MlchainRequestException(String message) {
        super(message);
    }
}