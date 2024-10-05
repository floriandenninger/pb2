package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aviw extends aonm implements aooz {
    public static final aviw a;
    private static volatile aopf d;
    public aulq b;
    public aviv c;
    private int e;
    private aulq f;
    private aulq g;
    private aulq h;
    private aota i;
    private byte j = 2;

    static {
        aviw aviwVar = new aviw();
        a = aviwVar;
        aonm.registerDefaultInstance(aviw.class, aviwVar);
    }

    private aviw() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\nᐉ\u0005\u000bဉ\u0006", new Object[]{"e", "f", "g", "h", "i", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aviw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aviw.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
