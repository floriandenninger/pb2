package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmw extends aonm implements aooz {
    public static final avmw a;
    private static volatile aopf l;
    public int b;
    public avgg c;
    public aqyg e;
    public aqyg f;
    public apmh g;
    public aqyg h;
    public aqyg i;
    public apmh j;
    public apmh k;
    private aota m;
    private byte n = 2;
    public aony d = emptyProtobufList();

    static {
        avmw avmwVar = new avmw();
        a = avmwVar;
        aonm.registerDefaultInstance(avmw.class, avmwVar);
    }

    private avmw() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b", new Object[]{"b", "c", "d", avgg.class, "e", "f", "g", "h", "i", "j", "k", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new avmw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (avmw.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
