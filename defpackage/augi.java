package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augi extends aonm implements aooz {
    public static final augi a;
    private static volatile aopf l;
    public int b;
    public aulq c;
    public aulq d;
    public augx e;
    public augx f;
    public apxf g;
    public avgg h;
    public apxf i;
    public aqyg j;
    private byte m = 2;
    public boolean k = true;

    static {
        augi augiVar = new augi();
        a = augiVar;
        aonm.registerDefaultInstance(augi.class, augiVar);
    }

    private augi() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ဉ\u0003\bᐉ\u0004\tဇ\b", new Object[]{"b", "c", "d", "e", "h", "i", "j", "f", "g", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new augi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (augi.class) {
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
