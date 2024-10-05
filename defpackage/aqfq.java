package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfq extends aonm implements aooz {
    public static final aqfq a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private atdf e;
    private aqfl f;
    private aqfh g;
    private aqfk h;
    private aota i;
    private apxf j;
    private apxf k;
    private apxf l;
    private aqyg m;
    private aqyg n;
    private apxf o;
    private byte p = 2;

    static {
        aqfq aqfqVar = new aqfq();
        a = aqfqVar;
        aonm.registerDefaultInstance(aqfq.class, aqfqVar);
    }

    private aqfq() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0005\u001b\f\u0000\u0000\f\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\fᐉ\u000b\rᐉ\f\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0015ᐉ\u0014\u0017ᐉ\u0016\u0018ᐉ\u0017\u001bᐉ\u001a", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfq.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
