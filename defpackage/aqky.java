package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqky extends aonm implements aooz {
    public static final aqky a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aulq h;
    private aulq i;
    private aulq j;
    private aulq k;
    private aulq l;
    private apxf m;
    private aota n;
    private aoxy o;
    private aqyg p;
    private byte q = 2;

    static {
        aqky aqkyVar = new aqky();
        a = aqkyVar;
        aonm.registerDefaultInstance(aqky.class, aqkyVar);
    }

    private aqky() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\r\u0001ᐉ\f\u0004ᐉ\u0001\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0006\tᐉ\u0007\nᐉ\b\fᐉ\u000b\rᐉ\u000e\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u0005\u0011ᐉ\u000f", new Object[]{"c", "n", "d", "e", "f", "h", "i", "j", "m", "o", "k", "l", "g", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aqky();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqky.class) {
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
