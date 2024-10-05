package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auex extends aonm implements aooz {
    public static final auex a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public avgg d;
    public apxf e;
    public int f;
    public int g;
    public aulq h;
    public aqyg i;
    private aota m;
    private byte n = 2;
    public aomf j = aomf.b;
    public aony k = emptyProtobufList();

    static {
        auex auexVar = new auex();
        a = auexVar;
        aonm.registerDefaultInstance(auex.class, auexVar);
    }

    private auex() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tည\b\nЛ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "k", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new auex();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (auex.class) {
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
