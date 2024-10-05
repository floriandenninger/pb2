package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avpw extends aonm implements aooz {
    public static final avpw a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public aqyg e;
    public apxf f;
    private aqyg i;
    private aqyg j;
    private aota k;
    public int c = 0;
    private byte l = 2;
    public aomf g = aomf.b;

    static {
        avpw avpwVar = new avpw();
        a = avpwVar;
        aonm.registerDefaultInstance(avpw.class, avpwVar);
    }

    private avpw() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\b\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0006\u0005ည\u0007\u0006ᐉ\b\u0007ᐉ\u0004\tᐉ\u0005\nᐼ\u0000", new Object[]{"d", "c", "b", avgg.class, arfs.class, "e", "f", "g", "k", "i", "j", avrf.class});
            case NEW_MUTABLE_INSTANCE:
                return new avpw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avpw.class) {
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
