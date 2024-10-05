package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arcz extends aonm implements aooz {
    public static final arcz a;
    private static volatile aopf h;
    public int b;
    public aqyg d;
    public int e;
    public arda f;
    public arcy g;
    private aulq i;
    private apxf j;
    private aqyg k;
    private aqyg l;
    private aota m;
    private byte n = 2;
    public aony c = emptyProtobufList();

    static {
        arcz arczVar = new arcz();
        a = arczVar;
        aonm.registerDefaultInstance(arcz.class, arczVar);
    }

    private arcz() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0007\u0001Л\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bင\u0006\tဉ\u0007\u000bᐉ\t\fဉ\n\u0011ᐉ\u0000", new Object[]{"b", "c", ardb.class, "d", "j", "k", "l", "e", "f", "m", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arcz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arcz.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
