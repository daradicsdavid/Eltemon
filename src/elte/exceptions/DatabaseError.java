package elte.exceptions;

import java.io.IOException;

public class DatabaseError extends Error {
    private final IOException e;

    public DatabaseError(IOException e) {

        this.e = e;
    }

    @Override
    public String toString() {
        return "DatabaseError{" +
                "e=" + e +
                '}';
    }
}
