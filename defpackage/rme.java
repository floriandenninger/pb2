package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rme implements vei {
    public final qob a;
    private final vdn b;

    public rme(Context context) {
        vdn vdnVar = new vdn();
        this.a = rmi.a(context.getApplicationContext());
        this.b = vdnVar;
    }

    private final ParcelFileDescriptor o(final Uri uri, final int i) {
        return (ParcelFileDescriptor) p("open file", new Callable() { // from class: rma
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rme rmeVar = rme.this;
                Uri uri2 = uri;
                int i2 = i;
                qob qobVar = rmeVar.a;
                final OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri2, i2);
                qrd b = qre.b();
                b.a = new qqu() { // from class: rmk
                    @Override // defpackage.qqu
                    public final void a(Object obj, Object obj2) {
                        OpenFileDescriptorRequest openFileDescriptorRequest2 = OpenFileDescriptorRequest.this;
                        rmp rmpVar = (rmp) obj;
                        rpv rpvVar = (rpv) obj2;
                        rmm rmmVar = new rmm(rpvVar);
                        try {
                            rmg rmgVar = (rmg) rmpVar.D();
                            Parcel pn = rmgVar.pn();
                            ecr.i(pn, rmmVar);
                            ecr.g(pn, openFileDescriptorRequest2);
                            rmgVar.pp(1, pn);
                        } catch (RemoteException unused) {
                            qar.o(Status.c, null, rpvVar);
                        }
                    }
                };
                b.b = i2 == 1 ? new Feature[]{qzz.f} : null;
                b.c = 7801;
                return ((OpenFileDescriptorResponse) rqr.d(qobVar.t(b.a()))).a;
            }
        });
    }

    private static final Object p(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(str.length() != 0 ? "Unable to ".concat(str) : new String("Unable to "), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof qnx) {
                qnx qnxVar = (qnx) cause;
                String str2 = qnxVar.a.h;
                if (qnxVar.a() == 33500) {
                    StringBuilder sb = new StringBuilder(str.length() + 19 + String.valueOf(str2).length());
                    sb.append("Unable to ");
                    sb.append(str);
                    sb.append(" because ");
                    sb.append(str2);
                    throw new FileNotFoundException(sb.toString());
                }
                if (qnxVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 19 + String.valueOf(str2).length());
                    sb2.append("Unable to ");
                    sb2.append(str);
                    sb2.append(" because ");
                    sb2.append(str2);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
            throw new IOException(str.length() != 0 ? "Unable to ".concat(str) : new String("Unable to "), e2);
        } catch (Exception e3) {
            throw new IOException(str.length() != 0 ? "Unable to ".concat(str) : new String("Unable to "), e3);
        }
    }

    @Override // defpackage.vei
    public final /* synthetic */ long a(Uri uri) {
        throw new vds("fileSize not supported by android");
    }

    @Override // defpackage.vei
    public final vdn b() {
        return this.b;
    }

    @Override // defpackage.vei
    public final /* synthetic */ File c(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Cannot convert uri to file android ");
        sb.append(valueOf);
        throw new vds(sb.toString());
    }

    @Override // defpackage.vei
    public final InputStream d(Uri uri) {
        return new rmc(o(uri, 0));
    }

    @Override // defpackage.vei
    public final /* synthetic */ OutputStream e(Uri uri) {
        throw new vds("openForAppend not supported by android");
    }

    @Override // defpackage.vei
    public final OutputStream f(Uri uri) {
        return new rmd(o(uri, 1));
    }

    @Override // defpackage.vei
    public final /* synthetic */ Iterable g(Uri uri) {
        throw new vds("children not supported by android");
    }

    @Override // defpackage.vei
    public final String h() {
        return "android";
    }

    @Override // defpackage.vei
    public final /* synthetic */ void i(Uri uri) {
        throw new vds("createDirectory not supported by android");
    }

    @Override // defpackage.vei
    public final /* synthetic */ void j(Uri uri) {
        throw new vds("deleteDirectory not supported by android");
    }

    @Override // defpackage.vei
    public final void k(final Uri uri) {
        p("delete file", new Callable() { // from class: rlz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rme rmeVar = rme.this;
                Uri uri2 = uri;
                qob qobVar = rmeVar.a;
                final DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri2);
                qrd b = qre.b();
                b.a = new qqu() { // from class: rmj
                    @Override // defpackage.qqu
                    public final void a(Object obj, Object obj2) {
                        DeleteFileRequest deleteFileRequest2 = DeleteFileRequest.this;
                        rmp rmpVar = (rmp) obj;
                        rpv rpvVar = (rpv) obj2;
                        rmn rmnVar = new rmn(rpvVar);
                        try {
                            rmg rmgVar = (rmg) rmpVar.D();
                            Parcel pn = rmgVar.pn();
                            ecr.i(pn, rmnVar);
                            ecr.g(pn, deleteFileRequest2);
                            rmgVar.pp(2, pn);
                        } catch (RemoteException unused) {
                            qar.o(Status.c, null, rpvVar);
                        }
                    }
                };
                b.b = new Feature[]{qzz.f};
                b.c = 7802;
                return (Void) rqr.d(qobVar.t(b.a()));
            }
        });
    }

    @Override // defpackage.vei
    public final void l(final Uri uri, final Uri uri2) {
        p("rename file", new Callable() { // from class: rmb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rme rmeVar = rme.this;
                Uri uri3 = uri;
                Uri uri4 = uri2;
                qob qobVar = rmeVar.a;
                final RenameRequest renameRequest = new RenameRequest(uri3, uri4);
                qrd b = qre.b();
                b.a = new qqu() { // from class: rml
                    @Override // defpackage.qqu
                    public final void a(Object obj, Object obj2) {
                        RenameRequest renameRequest2 = RenameRequest.this;
                        rmp rmpVar = (rmp) obj;
                        rpv rpvVar = (rpv) obj2;
                        rmo rmoVar = new rmo(rpvVar);
                        try {
                            rmg rmgVar = (rmg) rmpVar.D();
                            Parcel pn = rmgVar.pn();
                            ecr.i(pn, rmoVar);
                            ecr.g(pn, renameRequest2);
                            rmgVar.pp(3, pn);
                        } catch (RemoteException unused) {
                            qar.o(Status.c, null, rpvVar);
                        }
                    }
                };
                b.b = new Feature[]{qzz.g};
                b.b();
                b.c = 7803;
                return (Void) rqr.d(qobVar.t(b.a()));
            }
        });
    }

    @Override // defpackage.vei
    public final boolean m(Uri uri) {
        try {
            ParcelFileDescriptor o = o(uri, 0);
            if (o == null) {
                return true;
            }
            o.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.vei
    public final /* synthetic */ boolean n(Uri uri) {
        throw new vds("isDirectory not supported by android");
    }
}
