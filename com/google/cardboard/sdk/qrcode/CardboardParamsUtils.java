package com.google.cardboard.sdk.qrcode;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import com.google.cardboard.sdk.deviceparams.CardboardV1DeviceParams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class CardboardParamsUtils {
    static final String CARDBOARD_CONFIG_FOLDER = "Cardboard";
    static final String CARDBOARD_DEVICE_PARAMS_FILE = "current_device_params";
    static final int CARDBOARD_DEVICE_PARAMS_STREAM_SENTINEL = 894990891;
    private static final String HTTPS_SCHEME_PREFIX = "https://";
    private static final int HTTPS_TIMEOUT_MS = 5000;
    static final String HTTP_SCHEME = "http";
    private static final String HTTP_SCHEME_PREFIX = "http://";
    private static final int MAX_REDIRECTS = 5;
    private static final String TAG = "CardboardParamsUtils";
    static final int URI_CODING_PARAMS = 11;
    static final String URI_HOST_GOOGLE = "google.com";
    static final String URI_KEY_PARAMS = "p";
    static final String URI_PATH_CARDBOARD_CONFIG = "cardboard/cfg";
    static final String HTTPS_SCHEME = "https";
    static final String URI_HOST_GOOGLE_SHORT = "g.co";
    static final String URI_PATH_CARDBOARD_HOME = "cardboard";
    private static final Uri URI_ORIGINAL_CARDBOARD_QR_CODE = new Uri.Builder().scheme(HTTPS_SCHEME).authority(URI_HOST_GOOGLE_SHORT).appendEncodedPath(URI_PATH_CARDBOARD_HOME).build();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum StorageSource {
        SCOPED_STORAGE,
        EXTERNAL_STORAGE
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class UriToParamsStatus {
        public static final int STATUS_CONNECTION_ERROR = 2;
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_FORMAT = 1;
        public final byte[] params;
        public final int statusCode;

        private UriToParamsStatus(int i, byte[] bArr) {
            this.statusCode = i;
            this.params = bArr;
        }

        public static UriToParamsStatus error(int i) {
            return new UriToParamsStatus(i, null);
        }

        public static UriToParamsStatus success(byte[] bArr) {
            return new UriToParamsStatus(0, bArr);
        }
    }

    public static byte[] createFromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (isOriginalCardboardDeviceUri(uri)) {
            return CardboardV1DeviceParams.build().toByteArray();
        }
        if (isCardboardDeviceUri(uri)) {
            return readDeviceParamsFromUri(uri);
        }
        Log.w(TAG, String.format("URI \"%s\" not recognized as Cardboard viewer.", uri));
        return null;
    }

    private static Uri followCardboardParamRedirect(Uri uri, int i, UrlFactory urlFactory) {
        int i2 = 0;
        while (uri != null && !isCardboardUri(uri)) {
            if (i2 >= i) {
                return null;
            }
            uri = resolveHttpsRedirect(uri, urlFactory);
            i2++;
        }
        return uri;
    }

    private static File getDeviceParamsFile(StorageSource storageSource, Context context) {
        File externalStorageDirectory;
        if (storageSource == StorageSource.SCOPED_STORAGE) {
            externalStorageDirectory = context.getFilesDir();
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        }
        File file = new File(externalStorageDirectory, CARDBOARD_CONFIG_FOLDER);
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
            sb.append(valueOf);
            sb.append(" already exists as a file, but is expected to be a directory.");
            throw new IllegalStateException(sb.toString());
        }
        return new File(file, CARDBOARD_DEVICE_PARAMS_FILE);
    }

    public static UriToParamsStatus getParamsFromUriString(String str, UrlFactory urlFactory) {
        Uri parse = Uri.parse(str);
        if (parse == null) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("null".length() + 24);
            sb.append("Error when parsing URI: ");
            sb.append("null");
            Log.e(str2, sb.toString());
            return UriToParamsStatus.error(1);
        }
        if (parse.getScheme() == null) {
            String valueOf = String.valueOf(parse);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append(HTTPS_SCHEME_PREFIX);
            sb2.append(valueOf);
            parse = Uri.parse(sb2.toString());
        } else if (parse.getScheme().equals(HTTP_SCHEME)) {
            parse = Uri.parse(parse.toString().replaceFirst(HTTP_SCHEME_PREFIX, HTTPS_SCHEME_PREFIX));
        }
        try {
            String.valueOf(String.valueOf(parse)).length();
            Uri followCardboardParamRedirect = followCardboardParamRedirect(parse, 5, urlFactory);
            if (followCardboardParamRedirect == null) {
                Log.e(TAG, "Error when following URI redirects");
                return UriToParamsStatus.error(1);
            }
            byte[] createFromUri = createFromUri(followCardboardParamRedirect);
            if (createFromUri != null) {
                return UriToParamsStatus.success(createFromUri);
            }
            String str3 = TAG;
            String valueOf2 = String.valueOf(followCardboardParamRedirect);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 60);
            sb3.append("Error when parsing device parameters from URI query string: ");
            sb3.append(valueOf2);
            Log.e(str3, sb3.toString());
            return UriToParamsStatus.error(1);
        } catch (IOException e) {
            String str4 = TAG;
            String valueOf3 = String.valueOf(e);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
            sb4.append("Error while following URL redirect ");
            sb4.append(valueOf3);
            Log.w(str4, sb4.toString());
            return UriToParamsStatus.error(2);
        }
    }

    private static boolean isCardboardDeviceUri(Uri uri) {
        return HTTPS_SCHEME.equals(uri.getScheme()) && URI_HOST_GOOGLE.equals(uri.getAuthority()) && "/cardboard/cfg".equals(uri.getPath());
    }

    public static boolean isCardboardUri(Uri uri) {
        return isOriginalCardboardDeviceUri(uri) || isCardboardDeviceUri(uri);
    }

    private static boolean isOriginalCardboardDeviceUri(Uri uri) {
        return URI_ORIGINAL_CARDBOARD_QR_CODE.equals(uri);
    }

    public static byte[] readDeviceParams(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return readDeviceParamsFromStorage(StorageSource.EXTERNAL_STORAGE, context);
        }
        byte[] readDeviceParamsFromStorage = readDeviceParamsFromStorage(StorageSource.EXTERNAL_STORAGE, context);
        byte[] readDeviceParamsFromStorage2 = readDeviceParamsFromStorage(StorageSource.SCOPED_STORAGE, context);
        if (readDeviceParamsFromStorage == null || readDeviceParamsFromStorage2 != null) {
            return readDeviceParamsFromStorage2;
        }
        if (!writeDeviceParamsToStorage(readDeviceParamsFromStorage, StorageSource.SCOPED_STORAGE, context)) {
            Log.e(TAG, "Error writing device parameters to scoped storage.");
        }
        return readDeviceParamsFromStorage;
    }

    private static byte[] readDeviceParamsFromInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            if (inputStream.read(allocate.array(), 0, allocate.array().length) == -1) {
                Log.e(TAG, "Error parsing param record: end of stream.");
                return null;
            }
            int i = allocate.getInt();
            int i2 = allocate.getInt();
            if (i != CARDBOARD_DEVICE_PARAMS_STREAM_SENTINEL) {
                Log.e(TAG, "Error parsing param record: incorrect sentinel.");
                return null;
            }
            byte[] bArr = new byte[i2];
            if (inputStream.read(bArr, 0, i2) != -1) {
                return bArr;
            }
            Log.e(TAG, "Error parsing param record: end of stream.");
            return null;
        } catch (IOException e) {
            String str = TAG;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Error reading parameters: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
            return null;
        }
    }

    static byte[] readDeviceParamsFromStorage(StorageSource storageSource, Context context) {
        Throwable th;
        InputStream inputStream;
        byte[] bArr = null;
        try {
            try {
                inputStream = InputStreamProvider.get(getDeviceParamsFile(storageSource, context));
                try {
                    bArr = readDeviceParamsFromInputStream(inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (FileNotFoundException e) {
            String.valueOf(String.valueOf(e)).length();
        } catch (IllegalStateException e2) {
            String str = TAG;
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Error reading parameters: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
        }
        return bArr;
    }

    private static byte[] readDeviceParamsFromUri(Uri uri) {
        String queryParameter = uri.getQueryParameter(URI_KEY_PARAMS);
        if (queryParameter == null) {
            Log.w(TAG, "No Cardboard parameters in URI.");
            return null;
        }
        try {
            return Base64.decode(queryParameter, 11);
        } catch (Exception e) {
            String str = TAG;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append("Parsing Cardboard parameters from URI failed: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
            return null;
        }
    }

    private static Uri resolveHttpsRedirect(Uri uri, UrlFactory urlFactory) {
        HttpURLConnection openHttpsConnection = urlFactory.openHttpsConnection(uri);
        if (openHttpsConnection == null) {
            return null;
        }
        openHttpsConnection.setInstanceFollowRedirects(false);
        openHttpsConnection.setDoInput(false);
        openHttpsConnection.setConnectTimeout(HTTPS_TIMEOUT_MS);
        openHttpsConnection.setReadTimeout(HTTPS_TIMEOUT_MS);
        openHttpsConnection.setRequestProperty("Accept-Encoding", "");
        try {
            openHttpsConnection.setRequestMethod("HEAD");
            try {
                openHttpsConnection.connect();
                int responseCode = openHttpsConnection.getResponseCode();
                if (responseCode != 301 && responseCode != 302) {
                    return null;
                }
                String headerField = openHttpsConnection.getHeaderField("Location");
                if (headerField == null) {
                    return null;
                }
                if (headerField.length() != 0) {
                    "Location: ".concat(headerField);
                }
                Uri parse = Uri.parse(headerField.replaceFirst(HTTP_SCHEME_PREFIX, HTTPS_SCHEME_PREFIX));
                if (parse != null && parse.compareTo(uri) != 0) {
                    String.valueOf(String.valueOf(parse)).length();
                    return parse;
                }
                return null;
            } finally {
                openHttpsConnection.disconnect();
            }
        } catch (ProtocolException e) {
            Log.w(TAG, e.toString());
            return null;
        }
    }

    public static void saveCardboardV1DeviceParams(Context context) {
        if (writeDeviceParamsToStorage(CardboardV1DeviceParams.build().toByteArray(), Build.VERSION.SDK_INT < 29 ? StorageSource.EXTERNAL_STORAGE : StorageSource.SCOPED_STORAGE, context)) {
            return;
        }
        Log.e(TAG, "Could not write Cardboard parameters to storage.");
    }

    public static void saveParamsFromUri(byte[] bArr, Context context) {
        String str = new String(bArr);
        UriToParamsStatus paramsFromUriString = getParamsFromUriString(str, new UrlFactory());
        if (paramsFromUriString.statusCode != 0) {
            Log.e(TAG, str.length() != 0 ? "Error when trying to get the Cardboard params from URI: ".concat(str) : new String("Error when trying to get the Cardboard params from URI: "));
        } else {
            writeDeviceParams(paramsFromUriString.params, context);
        }
    }

    public static boolean writeDeviceParams(byte[] bArr, Context context) {
        return writeDeviceParamsToStorage(bArr, Build.VERSION.SDK_INT < 29 ? StorageSource.EXTERNAL_STORAGE : StorageSource.SCOPED_STORAGE, context);
    }

    private static boolean writeDeviceParamsToOutputStream(byte[] bArr, OutputStream outputStream) {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(CARDBOARD_DEVICE_PARAMS_STREAM_SENTINEL);
            allocate.putInt(bArr.length);
            outputStream.write(allocate.array());
            outputStream.write(bArr);
            return true;
        } catch (IOException e) {
            String str = TAG;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Error writing parameters: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean writeDeviceParamsToStorage(byte[] r3, com.google.cardboard.sdk.qrcode.CardboardParamsUtils.StorageSource r4, android.content.Context r5) {
        /*
            r0 = 0
            r1 = 0
            java.io.File r4 = getDeviceParamsFile(r4, r5)     // Catch: java.lang.Throwable -> L14 java.lang.IllegalStateException -> L16 java.io.FileNotFoundException -> L18
            java.io.OutputStream r0 = com.google.cardboard.sdk.qrcode.OutputStreamProvider.get(r4)     // Catch: java.lang.Throwable -> L14 java.lang.IllegalStateException -> L16 java.io.FileNotFoundException -> L18
            boolean r1 = writeDeviceParamsToOutputStream(r3, r0)     // Catch: java.lang.Throwable -> L14 java.lang.IllegalStateException -> L16 java.io.FileNotFoundException -> L18
            if (r0 == 0) goto L68
        L10:
            r0.close()     // Catch: java.io.IOException -> L68
            goto L68
        L14:
            r3 = move-exception
            goto L69
        L16:
            r3 = move-exception
            goto L1a
        L18:
            r3 = move-exception
            goto L41
        L1a:
            java.lang.String r4 = com.google.cardboard.sdk.qrcode.CardboardParamsUtils.TAG     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L14
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L14
            int r5 = r5 + 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "Error writing parameters: "
            r2.append(r5)     // Catch: java.lang.Throwable -> L14
            r2.append(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L14
            android.util.Log.w(r4, r3)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L68
            goto L10
        L41:
            java.lang.String r4 = com.google.cardboard.sdk.qrcode.CardboardParamsUtils.TAG     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L14
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L14
            int r5 = r5 + 39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "Parameters file not found for writing: "
            r2.append(r5)     // Catch: java.lang.Throwable -> L14
            r2.append(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L14
            android.util.Log.e(r4, r3)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L68
            goto L10
        L68:
            return r1
        L69:
            if (r0 == 0) goto L6e
            r0.close()     // Catch: java.io.IOException -> L6e
        L6e:
            goto L70
        L6f:
            throw r3
        L70:
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cardboard.sdk.qrcode.CardboardParamsUtils.writeDeviceParamsToStorage(byte[], com.google.cardboard.sdk.qrcode.CardboardParamsUtils$StorageSource, android.content.Context):boolean");
    }
}
