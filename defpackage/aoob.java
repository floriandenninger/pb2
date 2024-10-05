package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aoob extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public aoob(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static aooa a() {
        return new aooa("Protocol message tag had invalid wire type.");
    }

    public static aoob b() {
        return new aoob("Protocol message end-group tag did not match expected tag.");
    }

    public static aoob c() {
        return new aoob("Protocol message contained an invalid tag (zero).");
    }

    public static aoob d() {
        return new aoob("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoob e() {
        return new aoob("CodedInputStream encountered a malformed varint.");
    }

    public static aoob f() {
        return new aoob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static aoob g() {
        return new aoob("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoob h() {
        return new aoob("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoob i() {
        return new aoob("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static aoob j() {
        return new aoob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.a = true;
    }

    public aoob(String str) {
        super(str);
    }

    public aoob(String str, IOException iOException) {
        super(str, iOException);
    }
}
