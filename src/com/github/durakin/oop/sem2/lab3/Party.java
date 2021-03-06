package com.github.durakin.oop.sem2.lab3;

import java.util.HashMap;
import java.util.Map;


public class Party {
    private final Map<Integer, PartyMember> MEMBERS;
    private int lastGivenNumber;

    public Party() {
        this.MEMBERS = new HashMap<>();
        this.lastGivenNumber = 0;
    }

    public int addMember(String name, String lastName) {
        int cardNumber = ++this.lastGivenNumber;
        this.MEMBERS.put(cardNumber, new PartyMember(cardNumber, name, lastName));
        return this.lastGivenNumber;
    }

    public String partyMemberReportByCard(int cardNumber) {
        PartyMember partyMember = MEMBERS.get(cardNumber);
        return (partyMember != null) ? partyMember.toString() : null;
    }

    public boolean addProperty(int cardNumber, String assetDocumentCode) {
        PartyMember partyMember = MEMBERS.get(cardNumber);
        if (partyMember == null) {
            return false;
        }
        partyMember.addProperty(assetDocumentCode);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        this.MEMBERS.forEach((key, value) -> result.append(value.toString()).append('\n'));
        return result.toString();
    }
}
