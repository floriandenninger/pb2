package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqby extends aonm implements aooz {
    public static final aqby a;
    private static volatile aopf g;
    public int b;
    public apsp c;
    public aucy d;
    public aucz e;
    public arfu f;
    private auiq h;
    private atif i;
    private aqhs j;
    private awai k;
    private byte l = 2;

    static {
        aqby aqbyVar = new aqby();
        a = aqbyVar;
        aonm.registerDefaultInstance(aqby.class, aqbyVar);
    }

    private aqby() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\uf7c4ᜤ\uf8fbⴙ\b\u0000\u0000\b\uf7c4ᜤᐉ\u0001\uf1d2ᜫᐉ\u0000\ue391⊉ᐉ\u0002\uea90⪄ᐉ\u0006鸞⬄ᐉ\u0003\uefeeⱹᐉ\u0004\uf08eⳕᐉ\u0005\uf8fbⴙᐉ\u0007", new Object[]{"b", "d", "c", "e", "k", "h", "i", "j", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqby();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqby.class) {
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
