package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avza extends aonm implements aooz {
    public static final avza a;
    private static volatile aopf e;
    public int b;
    public avgg c;
    public aqyg d;
    private auzs f;
    private apxf g;
    private aqyg h;
    private aqyg i;
    private avzb j;
    private atco k;
    private aulq l;
    private aulq m;
    private aota n;
    private byte o = 2;

    static {
        avza avzaVar = new avza();
        a = avzaVar;
        aonm.registerDefaultInstance(avza.class, avzaVar);
    }

    private avza() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\n\u000bᐉ\u0007\u000eᐉ\t\u000fᐉ\u0005\u0010ᐉ\b", new Object[]{"b", "c", "d", "f", "g", "h", "j", "n", "k", "m", "i", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new avza();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avza.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
