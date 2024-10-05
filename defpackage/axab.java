package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axab implements awzw {
    @Override // defpackage.awzw
    public final axam a(String str, String str2, awzx awzxVar, awzu awzuVar) {
        try {
            return new axaa((HttpURLConnection) new URL(str).openConnection(), str2, awzxVar, awzuVar);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }
}
