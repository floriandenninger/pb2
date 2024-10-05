package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqai extends aonm implements aooz {
    public static final aqai a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apxf f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private apxf j;
    private aota k;
    private byte l = 2;

    static {
        aqai aqaiVar = new aqai();
        a = aqaiVar;
        aonm.registerDefaultInstance(aqai.class, aqaiVar);
    }

    private aqai() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\b\u0004ᐉ\n\u0005ᐉ\u0001\u0007ᐉ\u0003\bᐉ\u0004\nᐉ\u0006\u000bᐉ\u0007", new Object[]{"c", "d", "j", "k", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqai();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqai.class) {
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
