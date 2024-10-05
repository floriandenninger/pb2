package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atjb extends aonm implements aooz {
    public static final atjb a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private aulq f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aulq j;
    private aulq k;
    private byte l = 2;

    static {
        atjb atjbVar = new atjb();
        a = atjbVar;
        aonm.registerDefaultInstance(atjb.class, atjbVar);
    }

    private atjb() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"c", "d", "f", "e", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atjb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atjb.class) {
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
