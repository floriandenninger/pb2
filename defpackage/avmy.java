package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmy extends aonm implements aooz {
    public static final avmy a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public apmh e;
    public aulq g;
    public avmx i;
    public apxf j;
    private aota l;
    private apmh m;
    private aulq n;
    private byte o = 2;
    public aony d = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aomf h = aomf.b;

    static {
        avmy avmyVar = new avmy();
        a = avmyVar;
        aonm.registerDefaultInstance(avmy.class, avmyVar);
    }

    private avmy() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004Л\u0005ᐉ\u0003\u0006ည\u0004\u0007ᐉ\u0005\bᐉ\u0007\tᐉ\u0002\nᐉ\b\u000bᐉ\u0006", new Object[]{"b", "c", "d", avna.class, "e", "f", aqyg.class, "l", "h", "i", "m", "g", "n", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avmy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avmy.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
