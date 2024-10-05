package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcg extends aonm implements aooz {
    public static final aqcg a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public aqyg d;
    public apmh e;
    public boolean h;
    private aqyg j;
    private aota k;
    private byte l = 2;
    public aomf f = aomf.b;
    public aony g = emptyProtobufList();

    static {
        aqcg aqcgVar = new aqcg();
        a = aqcgVar;
        aonm.registerDefaultInstance(aqcg.class, aqcgVar);
    }

    private aqcg() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ည\u0005\u0005ᐉ\u0002\u0006ᐉ\u0001\u0007Л\tဇ\u0007", new Object[]{"b", "j", "e", "k", "f", "d", "c", "g", apxf.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqcg.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
