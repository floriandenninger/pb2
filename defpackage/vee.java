package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vee implements vcv {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public vee(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public static vee b() {
        return new vee(false, false);
    }

    @Override // defpackage.vcv
    public final /* bridge */ /* synthetic */ Object a(vcu vcuVar) {
        vdm vdmVar;
        vdl vdlVar;
        Closeable f;
        FileChannel channel;
        vdk vdkVar;
        FileLock tryLock;
        Uri build = vcuVar.e.buildUpon().path(String.valueOf(vcuVar.f.getPath()).concat(".lock")).fragment("").build();
        if (!this.a) {
            Semaphore a = vcuVar.b.b().a(build.toString());
            try {
                a.acquire();
                vdmVar = new vdm(a);
                try {
                    vdlVar = new vdl(vdmVar.a());
                } finally {
                    try {
                        vdmVar.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("semaphore not acquired: ");
                sb.append(valueOf);
                throw new InterruptedIOException(sb.toString());
            }
        } else {
            Semaphore a2 = vcuVar.b.b().a(build.toString());
            if (true != a2.tryAcquire()) {
                a2 = null;
            }
            vdmVar = new vdm(a2);
            try {
                if (vdmVar.a != null) {
                    vdlVar = new vdl(vdmVar.a());
                } else {
                    vdmVar.close();
                    vdlVar = null;
                }
            } finally {
                try {
                    vdmVar.close();
                } catch (Throwable unused2) {
                }
            }
        }
        vdp a3 = vdp.a(vdlVar);
        try {
            if (a3.a != null) {
                if (!this.b) {
                    f = vcuVar.b.f(build);
                } else if (!this.c) {
                    f = (Closeable) vcuVar.a.c(build, new vec(3));
                } else {
                    f = vcuVar.b.d(build);
                }
                a3 = vdp.a(f);
                try {
                    Closeable closeable = a3.a;
                    if (closeable instanceof vdg) {
                        channel = ((vdg) closeable).b();
                    } else if (closeable instanceof RandomAccessFile) {
                        channel = ((RandomAccessFile) closeable).getChannel();
                    } else {
                        throw new IOException("Lock stream not convertible to FileChannel");
                    }
                    FileChannel fileChannel = channel;
                    if (!this.a) {
                        vcuVar.b.b();
                        vdkVar = new vdk(fileChannel.lock(0L, Long.MAX_VALUE, this.b));
                    } else {
                        vcuVar.b.b();
                        try {
                            tryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, this.b);
                        } catch (IOException unused3) {
                        }
                        vdkVar = tryLock == null ? null : new vdk(tryLock);
                    }
                    a3 = vdp.a(vdkVar);
                    try {
                        if (a3.a == null) {
                            a3.close();
                            a3.close();
                        } else {
                            final Closeable b = a3.b();
                            final Closeable b2 = a3.b();
                            final Closeable b3 = a3.b();
                            Closeable closeable2 = new Closeable() { // from class: ved
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    Closeable closeable3 = b;
                                    Closeable closeable4 = b2;
                                    Closeable closeable5 = b3;
                                    try {
                                        if (closeable5 != null) {
                                            try {
                                                closeable5.close();
                                            } catch (Throwable th) {
                                                if (closeable4 != null) {
                                                    try {
                                                        closeable4.close();
                                                    } catch (Throwable unused4) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        if (closeable4 != null) {
                                            closeable4.close();
                                        }
                                        if (closeable3 != null) {
                                            closeable3.close();
                                        }
                                    } catch (Throwable th2) {
                                        if (closeable3 != null) {
                                            try {
                                                closeable3.close();
                                            } catch (Throwable unused5) {
                                            }
                                        }
                                        throw th2;
                                    }
                                }
                            };
                            a3.close();
                            a3.close();
                            a3.close();
                            return closeable2;
                        }
                    } finally {
                    }
                } finally {
                    try {
                        a3.close();
                    } catch (Throwable unused4) {
                    }
                }
            }
            return null;
        } finally {
            try {
                a3.close();
            } catch (Throwable unused5) {
            }
        }
    }
}
