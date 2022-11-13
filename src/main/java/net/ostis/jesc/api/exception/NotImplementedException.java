package net.ostis.jesc.api.exception;

public class NotImplementedException extends ScContextRuntimeException {
    /**
     * @param message - message about what went wrong
     */
    public NotImplementedException(String message) {
        super(message);
    }
}
