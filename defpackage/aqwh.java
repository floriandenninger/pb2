package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqwh extends aonm implements aooz {
    public static final aqwh a;
    private static volatile aopf i;
    public int b;
    public apxf d;
    public boolean e;
    public aulq g;
    public apxf h;
    private aota j;
    private aulq k;
    private aulq l;
    private byte m = 2;
    public aony c = emptyProtobufList();
    public aomf f = aomf.b;

    static {
        aqwh aqwhVar = new aqwh();
        a = aqwhVar;
        aonm.registerDefaultInstance(aqwh.class, aqwhVar);
    }

    private aqwh() {
    }

    public final void a() {
        aony aonyVar = this.c;
        if (aonyVar.c()) {
            return;
        }
        this.c = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0007\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0002\u0004ည\u0003\u0006ဇ\u0001\u0007ᐉ\u0004\bᐉ\u0005\u000bᐉ\b\fᐉ\t", new Object[]{"b", "c", aulq.class, "d", "j", "f", "e", "k", "l", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqwh();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqwh.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
