package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aowt extends aonm implements aooz {
    public static final aowt a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public apxf f;
    public aqyg h;
    public apxf i;
    private aqyg k;
    private aulq l;
    private aulq m;
    private aota n;
    private byte o = 2;
    public aony g = emptyProtobufList();

    static {
        aowt aowtVar = new aowt();
        a = aowtVar;
        aonm.registerDefaultInstance(aowt.class, aowtVar);
    }

    private aowt() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0005\u0007ᐉ\u0003\bᐉ\u0006\nᐉ\b\u000bᐉ\t\fᐉ\u0007\rᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", aows.class, "h", "f", "i", "m", "n", "l", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aowt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aowt.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
