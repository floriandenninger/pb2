package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.youtube.R;
import j$.util.function.Supplier;
import java.util.ArrayList;
import youtube.client.blocks.runtime.java.NativeBindingRouter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ghx implements Supplier {
    private final /* synthetic */ int t;
    public static final /* synthetic */ ghx s = new ghx(19);
    public static final /* synthetic */ ghx r = new ghx(18);
    public static final /* synthetic */ ghx q = new ghx(17);
    public static final /* synthetic */ ghx p = new ghx(16);
    public static final /* synthetic */ ghx o = new ghx(15);
    public static final /* synthetic */ ghx n = new ghx(13);
    public static final /* synthetic */ ghx m = new ghx(12);
    public static final /* synthetic */ ghx l = new ghx(11);
    public static final /* synthetic */ ghx k = new ghx(10);
    public static final /* synthetic */ ghx j = new ghx(9);
    public static final /* synthetic */ ghx i = new ghx(8);
    public static final /* synthetic */ ghx h = new ghx(7);
    public static final /* synthetic */ ghx g = new ghx(6);
    public static final /* synthetic */ ghx f = new ghx(5);
    public static final /* synthetic */ ghx e = new ghx(4);
    public static final /* synthetic */ ghx d = new ghx(3);
    public static final /* synthetic */ ghx c = new ghx(2);
    public static final /* synthetic */ ghx b = new ghx(1);
    public static final /* synthetic */ ghx a = new ghx(0);

    public /* synthetic */ ghx(int i2) {
        this.t = i2;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        switch (this.t) {
            case 0:
                return new SparseArray();
            case 1:
                return new Bundle();
            case 2:
                return new ArrayList();
            case 3:
            case 4:
                return 2;
            case 5:
                return new Bundle();
            case 6:
                return gfw.k(R.attr.ytBrandBackgroundSolid);
            case 7:
                return gfw.k(R.attr.ytStatusBarBackground);
            case 8:
                return gfw.k(R.attr.ytTextPrimary);
            case 9:
                return gfw.k(R.attr.ytTextSecondary);
            case 10:
                return gfw.k(R.attr.ytIconActiveOther);
            case 11:
                return new Bundle();
            case 12:
                return asfc.a;
            case 13:
                return amru.q();
            case 14:
                NativeBindingRouter nativeBindingRouter = NativeBindingRouter.a;
                try {
                    aong aongVar = (aong) awkg.a.createBuilder();
                    aone createBuilder = awlf.a.createBuilder();
                    createBuilder.copyOnWrite();
                    awlf awlfVar = (awlf) createBuilder.instance;
                    awlfVar.b = 1 | awlfVar.b;
                    awlfVar.c = 385812508;
                    awlf awlfVar2 = (awlf) createBuilder.build();
                    aongVar.copyOnWrite();
                    awkg awkgVar = (awkg) aongVar.instance;
                    awlfVar2.getClass();
                    awkgVar.c = awlfVar2;
                    awkgVar.b = 13;
                    return new bart(((awlg) aonm.parseFrom(awlg.a, nativeBindingRouter.nativeCallSyncBinding(((awkg) aongVar.build()).toByteArray()), aomw.b())).b, nativeBindingRouter);
                } catch (aoob e2) {
                    throw new bars(e2);
                }
            case 15:
                return 1;
            case 16:
                return amru.f();
            case 17:
                return amsu.d();
            case 18:
                return amsx.i();
            default:
                return new amrw();
        }
    }
}
