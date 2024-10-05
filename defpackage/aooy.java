package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface aooy extends aooz {
    aopf getParserForType();

    int getSerializedSize();

    aoox newBuilderForType();

    aoox toBuilder();

    byte[] toByteArray();

    aomf toByteString();

    void writeDelimitedTo(OutputStream outputStream);

    void writeTo(aomp aompVar);

    void writeTo(OutputStream outputStream);
}
