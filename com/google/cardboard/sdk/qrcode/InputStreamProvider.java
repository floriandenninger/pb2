package com.google.cardboard.sdk.qrcode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InputStreamProvider {
    private static Provider provider = new BufferedProvider();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class BufferedProvider implements Provider {
        @Override // com.google.cardboard.sdk.qrcode.InputStreamProvider.Provider
        public InputStream get(File file) {
            return new BufferedInputStream(new FileInputStream(file));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Provider {
        InputStream get(File file);
    }

    private InputStreamProvider() {
    }

    public static InputStream get(File file) {
        return provider.get(file);
    }

    public static Provider getDefaultProvider() {
        return new BufferedProvider();
    }

    public static void setProvider(Provider provider2) {
        provider = provider2;
    }
}
