package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwy extends aonm implements aooz {
    public static final auwy a;
    private static volatile aopf i;
    public int b;
    public int c;
    public avgg d;
    public avgg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    private apxf j;
    private aqyg k;
    private aulq l;
    private aulq m;
    private aulq n;
    private aulq o;
    private byte p = 2;

    static {
        auwy auwyVar = new auwy();
        a = auwyVar;
        aonm.registerDefaultInstance(auwy.class, auwyVar);
    }

    private auwy() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u000b\u0001ဋ\u0000\u0002ᐉ\u0003\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\n\u0007ᐉ\u0001\bᐉ\t\tᐉ\u000b\nᐉ\f\u000bᐉ\u0006\rᐉ\r\u000fᐉ\u0004", new Object[]{"b", "c", "e", "f", "g", "l", "d", "h", "m", "n", "k", "o", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new auwy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auwy.class) {
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
