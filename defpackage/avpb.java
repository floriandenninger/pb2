package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avpb extends aonm implements aooz {
    public static final avpb a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aqyg e;
    private aulq f;
    private aqyg g;
    private aqyg h;
    private apxf i;
    private apjt j;
    private aota k;
    private byte l = 2;

    static {
        avpb avpbVar = new avpb();
        a = avpbVar;
        aonm.registerDefaultInstance(avpb.class, avpbVar);
    }

    private avpb() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\b\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "k", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avpb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avpb.class) {
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
