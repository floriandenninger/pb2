package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apjj extends aonm implements aooz {
    public static final apjj a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private aulq f;
    private aota g;
    private aqyg h;
    private aulq i;
    private byte j = 2;

    static {
        apjj apjjVar = new apjj();
        a = apjjVar;
        aonm.registerDefaultInstance(apjj.class, apjjVar);
    }

    private apjj() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apjj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apjj.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
