package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancd {
    private static final Map a = new HashMap();

    private ancd() {
    }

    public static synchronized void a(String str) {
        InputStream systemResourceAsStream;
        String str2;
        synchronized (ancd.class) {
            if (((String) a.get(str)) != null) {
                return;
            }
            if (ancd.class.getClassLoader() != null) {
                systemResourceAsStream = ancd.class.getClassLoader().getResourceAsStream(str);
            } else {
                systemResourceAsStream = ClassLoader.getSystemResourceAsStream(str);
            }
            if (systemResourceAsStream == null) {
                String b = b(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
                sb.append("Couldn't find classloader resource '");
                sb.append(str);
                sb.append("'");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                String c = c(str, sb2);
                if (c == null) {
                    String property = System.getProperty("os.name");
                    if (property.equals("Mac OS X")) {
                        str2 = ".dylib";
                    } else {
                        if (!property.equals("Linux")) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(property).length() + 59);
                            sb3.append("Don't know how to unmap library name in current platform (");
                            sb3.append(property);
                            sb3.append(")");
                            throw new IllegalStateException(sb3.toString());
                        }
                        str2 = ".so";
                    }
                    if (b.length() > str2.length() + 3 && b.startsWith("lib") && b.endsWith(str2)) {
                        b = b.substring(3, b.length() - str2.length());
                    }
                    c = d(b, str, sb2);
                }
                if (c == null) {
                    throw new UnsatisfiedLinkError(sb2.toString());
                }
                return;
            }
            try {
                String b2 = b(str);
                String property2 = System.getProperty("java.io.tmpdir");
                String str3 = File.separator;
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb4 = new StringBuilder(String.valueOf(property2).length() + 21 + String.valueOf(str3).length());
                sb4.append(property2);
                sb4.append(str3);
                sb4.append(currentTimeMillis);
                sb4.append("-");
                String sb5 = sb4.toString();
                for (int i = 1; i < 10000; i++) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(sb5).length() + 11);
                    sb6.append(sb5);
                    sb6.append(i);
                    File file = new File(sb6.toString());
                    if (file.mkdirs()) {
                        try {
                            File canonicalFile = file.getCanonicalFile();
                            canonicalFile.deleteOnExit();
                            File file2 = new File(canonicalFile, b2);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = systemResourceAsStream.read(bArr);
                                        if (read != -1) {
                                            fileOutputStream.write(bArr, 0, read);
                                        } else {
                                            fileOutputStream.close();
                                            systemResourceAsStream.close();
                                            file2.deleteOnExit();
                                            e(str, file2);
                                            return;
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                systemResourceAsStream.close();
                                throw th2;
                            }
                        } catch (IOException unused2) {
                            continue;
                        }
                    }
                }
                String property3 = System.getProperty("java.io.tmpdir");
                StringBuilder sb7 = new StringBuilder(String.valueOf(sb5).length() + 85 + String.valueOf(sb5).length() + String.valueOf(property3).length());
                sb7.append("Failed to create any usable temp directory between ");
                sb7.append(sb5);
                sb7.append("1 and ");
                sb7.append(sb5);
                sb7.append("9999, where java.io.tmpdir=");
                sb7.append(property3);
                sb7.append(")");
                throw new AssertionError(sb7.toString());
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(message).length());
                sb8.append("Failed while writing input stream to temp file '");
                sb8.append(str);
                sb8.append("': ");
                sb8.append(message);
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb8.toString());
                unsatisfiedLinkError.initCause(e);
                throw unsatisfiedLinkError;
            }
        }
    }

    private static String b(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    private static String c(String str, StringBuilder sb) {
        try {
            System.load(str);
            a.put(str, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(message).length());
            sb2.append(". Couldn't load(");
            sb2.append(str);
            sb2.append("): ");
            sb2.append(message);
            sb.append(sb2.toString());
            return null;
        }
    }

    private static String d(String str, String str2, StringBuilder sb) {
        try {
            System.loadLibrary(str);
            a.put(str2, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(message).length());
            sb2.append(". Couldn't loadLibrary(");
            sb2.append(str);
            sb2.append("): ");
            sb2.append(message);
            sb.append(sb2.toString());
            return null;
        }
    }

    private static void e(String str, File file) {
        try {
            System.load(file.getPath());
            a.put(str, file.getPath());
            file.getPath();
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            String property = System.getProperty("sun.arch.data.model");
            if ((!message.contains("ELFCLASS64") || !"32".equals(property)) && (!message.contains("ELFCLASS32") || !"64".equals(property))) {
                throw e;
            }
            String message2 = e.getMessage();
            String str2 = true != property.equals("32") ? "k8" : "piii";
            StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 147 + str2.length());
            sb.append(message2);
            sb.append(". If you built this binary from google3, then you need to use the flag --java_cpu=");
            sb.append(str2);
            sb.append(".  Failure to do so may cause unpredictable and serious failures.");
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb.toString());
            unsatisfiedLinkError.setStackTrace(e.getStackTrace());
            throw unsatisfiedLinkError;
        }
    }
}
