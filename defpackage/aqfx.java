package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfx extends aonm implements aooz {
    public static final aqfx a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private atdf e;
    private aqfl f;
    private aqfn g;
    private aqyg h;
    private aqyg i;
    private aqfh j;
    private aqfk k;
    private aota l;
    private apxf m;
    private apxf n;
    private aqyg o;
    private aqyg p;
    private apxf q;
    private byte r = 2;

    static {
        aqfx aqfxVar = new aqfx();
        a = aqfxVar;
        aonm.registerDefaultInstance(aqfx.class, aqfxVar);
    }

    private aqfx() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u001a\u000e\u0000\u0000\u000e\u0002ᐉ\u0004\u0005ᐉ\t\u0006ᐉ\n\bᐉ\r\tᐉ\u0006\u000bᐉ\u000f\fᐉ\u0010\rᐉ\u0011\u000fᐉ\u0013\u0010ᐉ\u000b\u0013ᐉ\u0007\u0014ᐉ\f\u0018ᐉ\u0016\u001aᐉ\u0017", new Object[]{"c", "d", "g", "h", "k", "e", "l", "m", "n", "o", "i", "f", "j", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfx.class) {
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
