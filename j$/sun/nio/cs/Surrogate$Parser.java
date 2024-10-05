package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes5.dex */
public class Surrogate$Parser {
    private int character;
    private CoderResult error = CoderResult.UNDERFLOW;
    private boolean isPair;

    public CoderResult error() {
        return this.error;
    }

    public CoderResult unmappableResult() {
        return CoderResult.unmappableForLength(this.isPair ? 2 : 1);
    }

    public int parse(char c, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c)) {
            if (!charBuffer.hasRemaining()) {
                this.error = CoderResult.UNDERFLOW;
                return -1;
            }
            char c2 = charBuffer.get();
            if (Character.isLowSurrogate(c2)) {
                int codePoint = Character.toCodePoint(c, c2);
                this.character = codePoint;
                this.isPair = true;
                this.error = null;
                return codePoint;
            }
            this.error = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c)) {
            this.error = CoderResult.malformedForLength(1);
            return -1;
        }
        this.character = c;
        this.isPair = false;
        this.error = null;
        return c;
    }

    public int parse(char c, char[] cArr, int i, int i2) {
        if (!Character.isHighSurrogate(c)) {
            if (Character.isLowSurrogate(c)) {
                this.error = CoderResult.malformedForLength(1);
                return -1;
            }
            this.character = c;
            this.isPair = false;
            this.error = null;
            return c;
        }
        if (i2 - i < 2) {
            this.error = CoderResult.UNDERFLOW;
            return -1;
        }
        char c2 = cArr[i + 1];
        if (Character.isLowSurrogate(c2)) {
            int codePoint = Character.toCodePoint(c, c2);
            this.character = codePoint;
            this.isPair = true;
            this.error = null;
            return codePoint;
        }
        this.error = CoderResult.malformedForLength(1);
        return -1;
    }
}
