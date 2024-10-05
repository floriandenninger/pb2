package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotl extends aonm implements aooz {
    public static final aotl a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public aulq d;
    private int f;
    private aota g;
    private byte h = 2;

    static {
        aotl aotlVar = new aotl();
        a = aotlVar;
        aonm.registerDefaultInstance(aotl.class, aotlVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, aotlVar, aotlVar, null, 366527935, aoqn.MESSAGE, aotl.class);
    }

    private aotl() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0002\u0002ᐉ\u0001\u0004ဌ\u0003\u0005ᐉ\u0004", new Object[]{"f", "g", "c", aokr.t, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aotl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aotl.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
