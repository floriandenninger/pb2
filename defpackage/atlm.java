package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atlm extends aonm implements aooz {
    public static final atlm a;
    private static volatile aopf b;
    private int c;
    private atln d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apxf h;
    private atdf i;
    private aota j;
    private atll k;
    private byte l = 2;

    static {
        atlm atlmVar = new atlm();
        a = atlmVar;
        aonm.registerDefaultInstance(atlm.class, atlmVar);
    }

    private atlm() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\tᐉ\t\nᐉ\u0003", new Object[]{"c", "d", "e", "f", "h", "i", "j", "k", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atlm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atlm.class) {
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
