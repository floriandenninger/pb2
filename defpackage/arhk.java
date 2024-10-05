package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhk extends aonm implements aooz {
    public static final arhk a;
    private static volatile aopf m;
    public int b;
    public avgg c;
    public arhd d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public apxf j;
    private aota n;
    private byte o = 2;
    public aomf k = aomf.b;
    public aony l = emptyProtobufList();

    static {
        arhk arhkVar = new arhk();
        a = arhkVar;
        aonm.registerDefaultInstance(arhk.class, arhkVar);
    }

    private arhk() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0011\u000b\u0000\u0001\t\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\u000bᐉ\b\fည\t\u0010\u001b\u0011ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "n", "k", "l", asus.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arhk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arhk.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
