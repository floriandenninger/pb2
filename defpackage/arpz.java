package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpz extends aonm implements aooz {
    public static final arpz a;
    private static volatile aopf j;
    public int b;
    public Object d;
    public aqyg f;
    public avgg g;
    public aqyg h;
    public aqyg i;
    private aota k;
    private aqyg l;
    public int c = 0;
    private byte m = 2;
    public aomf e = aomf.b;

    static {
        arpz arpzVar = new arpz();
        a = arpzVar;
        aonm.registerDefaultInstance(arpz.class, arpzVar);
    }

    private arpz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐼ\u0000\tျ\u0000", new Object[]{"d", "c", "b", "k", "e", "f", "g", "h", "i", "l", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new arpz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (arpz.class) {
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
