package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayex extends ayfd {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final axzn b = axzn.a("cronet-annotation");
    static final axzn c = axzn.a("cronet-annotations");
    private static volatile boolean r;
    private static volatile Method s;
    public final String d;
    public final String e;
    public final ayoa f;
    public final Executor g;
    public final aycd h;
    public final ayfa i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public ayet o;
    public final ayix p;
    private final ayew t;

    public ayex(String str, String str2, Executor executor, aycd aycdVar, ayfa ayfaVar, Runnable runnable, Object obj, int i, aych aychVar, ayoa ayoaVar, axzo axzoVar, ayoj ayojVar) {
        super(ayoaVar, aycdVar, axzoVar);
        this.t = new ayew(this);
        str.getClass();
        this.d = str;
        str2.getClass();
        this.e = str2;
        this.f = ayoaVar;
        this.g = executor;
        this.h = aycdVar;
        this.i = ayfaVar;
        this.j = runnable;
        this.l = aychVar.a == aycg.UNARY;
        this.m = axzoVar.e(b);
        this.n = (Collection) axzoVar.e(c);
        this.p = new ayix(this, i, ayoaVar, obj, ayojVar);
        f();
    }

    public static void q(ExperimentalBidirectionalStream.Builder builder, Object obj) {
        if (!r) {
            synchronized (ayex.class) {
                try {
                    if (!r) {
                        try {
                            s = ExperimentalBidirectionalStream.Builder.class.getMethod("addRequestAnnotation", Object.class);
                        } catch (NoSuchMethodException e) {
                            Log.w("grpc-java-cronet", "Failed to load method ExperimentalBidirectionalStream.Builder.addRequestAnnotation", e);
                            r = true;
                        }
                    }
                } finally {
                    r = true;
                }
            }
        }
        if (s != null) {
            try {
                s.invoke(builder, obj);
            } catch (IllegalAccessException e2) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Failed to add request annotation: ");
                sb.append(valueOf);
                Log.w("grpc-java-cronet", sb.toString(), e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause() == null ? e3.getTargetException() : e3.getCause());
            }
        }
    }

    @Override // defpackage.aygd
    public final axzj a() {
        return axzj.a;
    }

    @Override // defpackage.ayfd, defpackage.ayfi
    public final /* synthetic */ ayfh p() {
        return this.p;
    }

    public final void r(Status status) {
        this.i.a(this, status);
    }

    public final void s(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.k;
        if (bidirectionalStream == null) {
            return;
        }
        bidirectionalStream.write(byteBuffer, z);
        if (z2) {
            this.k.flush();
        }
    }

    @Override // defpackage.ayfd
    protected final /* synthetic */ ayfh t() {
        return this.p;
    }

    @Override // defpackage.ayfd
    protected final /* synthetic */ ayew u() {
        return this.t;
    }
}
