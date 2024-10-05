package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arwv extends aonm implements aooz {
    public static final arwv a;
    private static volatile aopf g;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    private int h;
    private aqyg i;
    private byte j = 2;
    public String b = "";

    static {
        arwv arwvVar = new arwv();
        a = arwvVar;
        aonm.registerDefaultInstance(arwv.class, arwvVar);
    }

    private arwv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"h", "b", "c", "i", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arwv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arwv.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
