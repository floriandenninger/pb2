package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phn implements pho {
    public boolean a;
    public final quw b;
    private final boolean c;
    private final Cipher d;
    private final SecretKeySpec e;
    private final SecureRandom f;
    private phw g;

    public phn(File file, byte[] bArr, boolean z) {
        Cipher cipher;
        SecretKeySpec secretKeySpec;
        if (bArr != null) {
            pse.e(bArr.length == 16);
            try {
                int i = pts.a;
                cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            pse.e(!z);
            cipher = null;
            secretKeySpec = null;
        }
        this.c = z;
        this.d = cipher;
        this.e = secretKeySpec;
        this.f = z ? new SecureRandom() : null;
        this.b = new quw(file);
    }

    private static final int d(phm phmVar, int i) {
        int hashCode = (phmVar.a * 31) + phmVar.b.hashCode();
        if (i < 2) {
            long K = muf.K(phmVar.d);
            return (hashCode * 31) + ((int) (K ^ (K >>> 32)));
        }
        return (hashCode * 31) + phmVar.d.hashCode();
    }

    public final void a(HashMap hashMap) {
        psd psdVar;
        DataOutputStream dataOutputStream;
        Closeable closeable = null;
        try {
            quw quwVar = this.b;
            if (quwVar.a.exists()) {
                if (!quwVar.b.exists()) {
                    if (!quwVar.a.renameTo(quwVar.b)) {
                        String valueOf = String.valueOf(quwVar.a);
                        String valueOf2 = String.valueOf(quwVar.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
                        sb.append("Couldn't rename file ");
                        sb.append(valueOf);
                        sb.append(" to backup file ");
                        sb.append(valueOf2);
                        Log.w("AtomicFile", sb.toString());
                    }
                } else {
                    quwVar.a.delete();
                }
            }
            try {
                psdVar = new psd(quwVar.a);
            } catch (FileNotFoundException e) {
                File parentFile = quwVar.a.getParentFile();
                if (parentFile == null || !parentFile.mkdirs()) {
                    String valueOf3 = String.valueOf(quwVar.a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                    sb2.append("Couldn't create ");
                    sb2.append(valueOf3);
                    throw new IOException(sb2.toString(), e);
                }
                try {
                    psdVar = new psd(quwVar.a);
                } catch (FileNotFoundException e2) {
                    String valueOf4 = String.valueOf(quwVar.a);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                    sb3.append("Couldn't create ");
                    sb3.append(valueOf4);
                    throw new IOException(sb3.toString(), e2);
                }
            }
            phw phwVar = this.g;
            if (phwVar != null) {
                phwVar.a(psdVar);
            } else {
                this.g = new phw(psdVar);
            }
            dataOutputStream = new DataOutputStream(this.g);
        } catch (Throwable th) {
            th = th;
            pts.O(closeable);
            throw th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.c ? 1 : 0);
            if (this.c) {
                byte[] bArr = new byte[16];
                this.f.nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.d.init(1, this.e, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(this.g, this.d));
                } catch (InvalidAlgorithmParameterException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e4) {
                    e = e4;
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (phm phmVar : hashMap.values()) {
                dataOutputStream.writeInt(phmVar.a);
                dataOutputStream.writeUTF(phmVar.b);
                Set<Map.Entry> entrySet = phmVar.d.b.entrySet();
                dataOutputStream.writeInt(entrySet.size());
                for (Map.Entry entry : entrySet) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    byte[] bArr2 = (byte[]) entry.getValue();
                    dataOutputStream.writeInt(bArr2.length);
                    dataOutputStream.write(bArr2);
                }
                i += d(phmVar, 2);
            }
            dataOutputStream.writeInt(i);
            quw quwVar2 = this.b;
            dataOutputStream.close();
            quwVar2.b.delete();
            pts.O(null);
        } catch (Throwable th2) {
            th = th2;
            closeable = dataOutputStream;
            pts.O(closeable);
            throw th;
        }
    }

    public final boolean b(HashMap hashMap, SparseArray sparseArray) {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        int i;
        phr phrVar;
        quw quwVar = this.b;
        if (!quwVar.a.exists() && !quwVar.b.exists()) {
            return true;
        }
        byte[] bArr = null;
        try {
            quw quwVar2 = this.b;
            if (quwVar2.b.exists()) {
                quwVar2.a.delete();
                quwVar2.b.renameTo(quwVar2.a);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(quwVar2.a));
            DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
            try {
                int readInt = dataInputStream3.readInt();
                if (readInt >= 0) {
                    int i2 = 2;
                    if (readInt <= 2) {
                        if ((dataInputStream3.readInt() & 1) != 0) {
                            if (this.d == null) {
                                pts.O(dataInputStream3);
                                return false;
                            }
                            byte[] bArr2 = new byte[16];
                            dataInputStream3.readFully(bArr2);
                            try {
                                this.d.init(2, this.e, new IvParameterSpec(bArr2));
                                dataInputStream3 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.d));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.c) {
                            this.a = true;
                        }
                        int readInt2 = dataInputStream3.readInt();
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < readInt2) {
                            int readInt3 = dataInputStream3.readInt();
                            String readUTF = dataInputStream3.readUTF();
                            if (readInt < i2) {
                                long readLong = dataInputStream3.readLong();
                                rzb rzbVar = new rzb(bArr);
                                rzb.i(rzbVar, readLong);
                                phrVar = phr.a.a(rzbVar);
                                i = readInt2;
                            } else {
                                int readInt4 = dataInputStream3.readInt();
                                HashMap hashMap2 = new HashMap();
                                int i5 = 0;
                                while (i5 < readInt4) {
                                    String readUTF2 = dataInputStream3.readUTF();
                                    int readInt5 = dataInputStream3.readInt();
                                    if (readInt5 < 0) {
                                        StringBuilder sb = new StringBuilder(31);
                                        sb.append("Invalid value size: ");
                                        sb.append(readInt5);
                                        throw new IOException(sb.toString());
                                    }
                                    int min = Math.min(readInt5, 10485760);
                                    byte[] bArr3 = pts.f;
                                    int i6 = 0;
                                    while (i6 != readInt5) {
                                        int i7 = readInt2;
                                        int i8 = i6 + min;
                                        bArr3 = Arrays.copyOf(bArr3, i8);
                                        dataInputStream3.readFully(bArr3, i6, min);
                                        min = Math.min(readInt5 - i8, 10485760);
                                        i6 = i8;
                                        readInt2 = i7;
                                    }
                                    hashMap2.put(readUTF2, bArr3);
                                    i5++;
                                    readInt2 = readInt2;
                                }
                                i = readInt2;
                                phrVar = new phr(hashMap2);
                            }
                            phm phmVar = new phm(readInt3, readUTF, phrVar);
                            hashMap.put(phmVar.b, phmVar);
                            sparseArray.put(phmVar.a, phmVar.b);
                            i4 += d(phmVar, readInt);
                            i3++;
                            readInt2 = i;
                            bArr = null;
                            i2 = 2;
                        }
                        int readInt6 = dataInputStream3.readInt();
                        int read = dataInputStream3.read();
                        if (readInt6 == i4 && read == -1) {
                            pts.O(dataInputStream3);
                            return true;
                        }
                    }
                }
                pts.O(dataInputStream3);
                return false;
            } catch (IOException unused) {
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    return false;
                }
                pts.O(dataInputStream2);
                return false;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream3;
                if (dataInputStream != null) {
                    pts.O(dataInputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
            dataInputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
    }

    @Override // defpackage.pho
    public final void c() {
        this.a = true;
    }
}
