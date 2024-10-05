package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awzy {
    public final int a;
    public final awzx b;
    public final InputStream c;

    public awzy(int i, awzx awzxVar, InputStream inputStream) {
        this.a = i;
        this.b = awzxVar;
        this.c = inputStream;
    }

    public final String a() {
        String concat;
        String a = this.b.a("X-GUploader-UploadID");
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        if (a == null) {
            concat = "\n No upload id.";
        } else {
            concat = a.length() != 0 ? "\n Upload id: ".concat(a) : new String("\n Upload id: ");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(concat).length());
        sb.append("HttpResponse:\n   ");
        sb.append(i);
        sb.append("  ");
        sb.append(valueOf);
        sb.append(concat);
        return sb.toString();
    }
}
