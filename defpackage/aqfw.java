package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfw extends aonm implements aooz {
    public static final aqfw a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private atdf e;
    private aqfl f;
    private aqyg g;
    private aqfh h;
    private aqfk i;
    private aota j;
    private apxf k;
    private apxf l;
    private aqyg m;
    private apxf n;
    private byte o = 2;

    static {
        aqfw aqfwVar = new aqfw();
        a = aqfwVar;
        aonm.registerDefaultInstance(aqfw.class, aqfwVar);
    }

    private aqfw() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u0018\u000b\u0000\u0000\u000b\u0002ᐉ\u0004\u0004ᐉ\b\u0007ᐉ\u000b\tᐉ\u0006\u000bᐉ\r\fᐉ\u000e\rᐉ\u000f\u0012ᐉ\u0007\u0013ᐉ\n\u0016ᐉ\u0014\u0018ᐉ\u0015", new Object[]{"c", "d", "g", "i", "e", "j", "k", "l", "f", "h", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfw.class) {
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
