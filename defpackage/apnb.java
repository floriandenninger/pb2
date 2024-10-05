package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apnb extends aonm implements aooz {
    public static final apnb a;
    private static volatile aopf f;
    public int b;
    public auzj c;
    public aprb d;
    public avsr e;
    private apmg g;
    private byte h = 2;

    static {
        apnb apnbVar = new apnb();
        a = apnbVar;
        aonm.registerDefaultInstance(apnb.class, apnbVar);
    }

    private apnb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue084ᡰ\ueb11ἑ\u0004\u0000\u0000\u0004\ue084ᡰᐉ\u0001\ue2d9ᩭᐉ\u0000\ue61fḖᐉ\u0002\ueb11ἑᐉ\u0003", new Object[]{"b", "d", "c", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apnb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apnb.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
