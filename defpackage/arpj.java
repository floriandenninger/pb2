package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpj extends aonm implements aooz {
    public static final arpj a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public aqrq d;
    public aryi f;
    public aqrz g;
    private aota i;
    private aqry j;
    private byte k = 2;
    public aomf e = aomf.b;

    static {
        arpj arpjVar = new arpj();
        a = arpjVar;
        aonm.registerDefaultInstance(arpj.class, arpjVar);
    }

    private arpj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003\u0006ᐉ\u0004\u0007ဉ\u0006\nᐉ\u0005", new Object[]{"b", "c", "d", "i", "e", "j", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arpj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arpj.class) {
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
