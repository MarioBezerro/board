package br.com.board.dto;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum Kind,
                             int cardsAmount) {
}
