package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auge extends aonm implements aooz {
    public static final auge a;
    private static volatile aopf m;
    public int b;
    public aulq c;
    public aulq d;
    public augx e;
    public augx f;
    public apxf g;
    public avgg h;
    public apxf i;
    public aqyg j;
    private byte n = 2;
    public String k = "";
    public boolean l = true;

    static {
        auge augeVar = new auge();
        a = augeVar;
        aonm.registerDefaultInstance(auge.class, augeVar);
    }

    private auge() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဈ\b\nဇ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new auge();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (auge.class) {
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
